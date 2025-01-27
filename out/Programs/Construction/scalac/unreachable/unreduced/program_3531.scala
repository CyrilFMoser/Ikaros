package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[T_A[T_B[Char, Byte], T_B[Byte, (Char,Int)]], T_B[T_A[Int, Byte], T_A[Char, Boolean]]]
case class CC_B() extends T_A[T_A[T_B[Char, Byte], T_B[Byte, (Char,Int)]], T_B[T_A[Int, Byte], T_A[Char, Boolean]]]
case class CC_C(a: T_B[T_A[CC_B, CC_B], Int]) extends T_A[T_A[T_B[Char, Byte], T_B[Byte, (Char,Int)]], T_B[T_A[Int, Byte], T_A[Char, Boolean]]]
case class CC_D[F](a: T_B[F, F]) extends T_B[T_A[CC_A[CC_C], T_A[CC_C, CC_B]], F]

val v_a: T_A[T_A[T_B[Char, Byte], T_B[Byte, (Char,Int)]], T_B[T_A[Int, Byte], T_A[Char, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_A()