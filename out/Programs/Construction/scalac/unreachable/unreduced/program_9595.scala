package Program_30 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Int]], b: (T_A[Int],T_A[Boolean])) extends T_A[Int]
case class CC_B(a: Byte, b: T_A[Int], c: Int) extends T_A[Int]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(0, _, _) => 1 
}
}
// This is not matched: CC_B(_, _, _)