package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B[D](a: ((Boolean,Byte),T_A[Boolean]), b: T_B[D], c: D) extends T_A[D]
case class CC_C(a: T_A[Int], b: T_B[T_A[Char]]) extends T_B[T_A[Int]]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}