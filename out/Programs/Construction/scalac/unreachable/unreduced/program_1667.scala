package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_B[Char, Byte], T_A[Int]], b: T_B[T_A[Byte], T_B[Int, Boolean]], c: T_A[T_A[Char]]) extends T_A[T_A[Int]]
case class CC_B(a: CC_A, b: CC_A, c: T_A[T_A[Int]]) extends T_A[T_A[Int]]
case class CC_C(a: T_B[(CC_B,(Boolean,Byte)), Char], b: Char) extends T_A[T_A[Int]]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, _) => 2 
}
}