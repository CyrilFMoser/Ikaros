package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: T_B[CC_A], b: T_B[Byte], c: T_B[Int]) extends T_B[Int]
case class CC_C() extends T_B[Int]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_B(_, _, CC_C()) => 1 
}
}
// This is not matched: (CC_C (T_A (T_A (CC_A (T_A Boolean)
//                      (T_A Boolean)
//                      (T_A (T_A Boolean))
//                      (T_A Boolean)))))