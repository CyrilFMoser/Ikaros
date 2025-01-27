package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: (T_B[T_A],T_B[T_A]), b: ((T_A,(Char,Boolean)),T_B[T_A])) extends T_A
case class CC_B(a: Int) extends T_B[CC_A]
case class CC_C(a: T_B[(CC_A,CC_B)], b: CC_B) extends T_B[CC_A]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_B(12) => 0 
  case CC_B(_) => 1 
  case CC_C(_, _) => 2 
}
}