package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: Int, b: T_B[(Boolean,Boolean), (Char,Char)]) extends T_A[((Int,Boolean),T_A[Boolean, Char]), T_A[T_B[Boolean, Int], T_A[Byte, Char]]]
case class CC_B() extends T_A[((Int,Boolean),T_A[Boolean, Char]), T_A[T_B[Boolean, Int], T_A[Byte, Char]]]
case class CC_C(a: T_A[CC_A, T_A[CC_B, CC_B]]) extends T_A[((Int,Boolean),T_A[Boolean, Char]), T_A[T_B[Boolean, Int], T_A[Byte, Char]]]
case class CC_D[F, E](a: T_B[E, F], b: F) extends T_B[E, F]

val v_a: T_A[((Int,Boolean),T_A[Boolean, Char]), T_A[T_B[Boolean, Int], T_A[Byte, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(12, CC_D(CC_D(_, _), _)) => 0 
  case CC_A(_, CC_D(CC_D(_, _), _)) => 1 
  case CC_B() => 2 
  case CC_C(_) => 3 
}
}