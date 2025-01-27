package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[(Boolean,Int)]
case class CC_B(a: Boolean, b: Char, c: T_A[Int]) extends T_A[(Boolean,Int)]
case class CC_C(a: T_A[CC_B], b: T_B[Boolean]) extends T_A[(Boolean,Int)]

val v_a: T_A[(Boolean,Int)] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}
// This is not matched: CC_C(_, _)