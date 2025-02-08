import { defineConfig } from "vite";
import react from "@vitejs/plugin-react";
import tsconfigPaths from "vite-tsconfig-paths";

// https://vite.dev/config/
export default defineConfig({
  plugins: [react(), tsconfigPaths()],
  define: {
    global: {}
  },
  server: {
    watch: {
      usePolling: true,
      interval: 100
    },
    host: true,
    strictPort: true,
    port: 5173
  }
});