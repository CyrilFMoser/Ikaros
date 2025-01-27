package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_A[E, F], b: T_B[F, E]) extends T_A[E, F]
case class CC_B() extends T_A[T_B[T_B[Int, Char], Int], T_A[T_A[Int, Int], T_A[Int, Char]]]
case class CC_C(a: T_A[CC_A[CC_B, (Byte,Byte)], T_A[CC_B, CC_B]], b: CC_A[CC_A[CC_B, Int], CC_A[CC_B, CC_B]], c: T_A[CC_B, CC_B]) extends T_B[T_A[T_A[CC_B, (Char,Boolean)], T_B[Byte, Char]], Byte]
case class CC_D(a: T_A[T_A[(Int,Boolean), CC_B], CC_C]) extends T_B[T_A[T_A[CC_B, (Char,Boolean)], T_B[Byte, Char]], Byte]
case class CC_E(a: T_A[T_A[CC_B, CC_B], Boolean]) extends T_B[T_A[T_A[CC_B, (Char,Boolean)], T_B[Byte, Char]], Byte]

val v_a: T_A[T_B[T_B[Int, Char], Int], T_A[T_A[Int, Int], T_A[Int, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_A(CC_B(), _) => 1 
  case CC_B() => 2 
}
}