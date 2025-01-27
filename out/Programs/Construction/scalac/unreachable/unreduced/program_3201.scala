package Program_13 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Boolean]], b: T_A[(Boolean,Char)], c: T_A[T_A[Byte]]) extends T_A[T_A[Int]]
case class CC_B(a: T_A[T_A[Int]]) extends T_A[T_A[Int]]
case class CC_C(a: CC_B) extends T_A[T_A[Int]]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
  case CC_C(CC_B(CC_A(_, _, _))) => 2 
  case CC_C(CC_B(CC_B(_))) => 3 
  case CC_C(CC_B(CC_C(_))) => 4 
}
}