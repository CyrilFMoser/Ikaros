package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: (T_A[Int, (Boolean,Char)],T_A[Byte, Boolean])) extends T_A[D, T_A[T_A[(Int,Byte), Int], T_A[Boolean, (Byte,Boolean)]]]
case class CC_B[E]() extends T_A[E, T_A[T_A[(Int,Byte), Int], T_A[Boolean, (Byte,Boolean)]]]
case class CC_C[F](a: Boolean) extends T_B[F]
case class CC_D[G](a: G, b: T_A[G, G], c: T_B[G]) extends T_B[G]
case class CC_E[H](a: (T_B[Boolean],T_B[Boolean])) extends T_B[H]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(_, _, _) => 1 
  case CC_E((CC_C(_),CC_D(_, _, _))) => 2 
  case CC_E((CC_C(_),CC_E(_))) => 3 
  case CC_E((CC_D(_, _, _),CC_C(_))) => 4 
  case CC_E((CC_D(_, _, _),CC_D(_, _, _))) => 5 
  case CC_E((CC_D(_, _, _),CC_E(_))) => 6 
  case CC_E((CC_E(_),CC_C(_))) => 7 
  case CC_E((CC_E(_),CC_D(_, _, _))) => 8 
  case CC_E((CC_E(_),CC_E(_))) => 9 
}
}
// This is not matched: CC_E((CC_C(_),CC_C(_)))