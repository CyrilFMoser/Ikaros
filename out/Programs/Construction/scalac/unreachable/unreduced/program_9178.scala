package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_B[Boolean, (Byte,Char)], T_A[Boolean]]) extends T_A[Boolean]
case class CC_B[D, E]() extends T_B[E, D]
case class CC_C[G, F](a: (T_B[CC_A, CC_A],T_B[CC_A, Char])) extends T_B[G, F]
case class CC_D[H, I](a: H, b: CC_B[I, I], c: T_A[I]) extends T_B[I, H]

val v_a: T_B[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C((CC_B(),CC_B())) => 1 
  case CC_C((CC_B(),CC_C(_))) => 2 
  case CC_C((CC_B(),CC_D(_, _, _))) => 3 
  case CC_C((CC_C(_),CC_B())) => 4 
  case CC_C((CC_C(_),CC_C(_))) => 5 
  case CC_C((CC_C(_),CC_D(_, _, _))) => 6 
  case CC_C((CC_D(_, _, _),CC_B())) => 7 
  case CC_C((CC_D(_, _, _),CC_C(_))) => 8 
  case CC_C((CC_D(_, _, _),CC_D(_, _, _))) => 9 
  case CC_D(12, CC_B(), CC_A(CC_B())) => 10 
  case CC_D(_, CC_B(), CC_A(CC_B())) => 11 
  case CC_D(12, CC_B(), CC_A(CC_C(_))) => 12 
  case CC_D(_, CC_B(), CC_A(CC_C(_))) => 13 
  case CC_D(12, CC_B(), CC_A(CC_D(_, _, _))) => 14 
  case CC_D(_, CC_B(), CC_A(CC_D(_, _, _))) => 15 
}
}