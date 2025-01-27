package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_A[Byte, T_B[Byte]], b: T_A[Byte, T_B[Byte]]) extends T_A[T_B[T_B[Boolean]], Char]
case class CC_B() extends T_A[T_B[T_B[Boolean]], Char]
case class CC_C(a: T_B[T_A[Char, (Int,Boolean)]], b: Int, c: T_A[Byte, CC_A]) extends T_B[(Int,CC_B)]
case class CC_D(a: T_B[CC_C], b: T_A[Int, CC_C]) extends T_B[(Int,CC_B)]

val v_a: T_A[T_B[T_B[Boolean]], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}