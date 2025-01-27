package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Char, b: T_A[T_A[Char]]) extends T_A[T_B[T_A[Int]]]
case class CC_B[C](a: CC_A, b: T_B[C], c: T_A[C]) extends T_B[C]
case class CC_C(a: T_B[T_A[Int]], b: T_B[T_B[Byte]]) extends T_B[T_B[CC_A]]
case class CC_D[D]() extends T_B[D]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _), CC_B(CC_A(_, _), CC_B(_, _, _), _), _) => 0 
  case CC_B(CC_A(_, _), CC_B(CC_A(_, _), CC_D(), _), _) => 1 
  case CC_B(CC_A(_, _), CC_D(), _) => 2 
  case CC_D() => 3 
}
}