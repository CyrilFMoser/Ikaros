package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_B[Int, T_A], b: (T_A,T_A)) extends T_A
case class CC_D() extends T_B[Boolean, CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, (CC_A(),_)) => 1 
}
}
// This is not matched: (CC_A Char (T_A Char))