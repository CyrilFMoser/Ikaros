package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A], b: T_A) extends T_A
case class CC_B(a: (Boolean,CC_A)) extends T_B[(Boolean,T_B[T_A])]
case class CC_C(a: (CC_A,Int), b: Int) extends T_B[(Boolean,T_B[T_A])]

val v_a: T_B[(Boolean,T_B[T_A])] = null
val v_b: Int = v_a match{
  case CC_B((_,CC_A(_, _))) => 0 
  case CC_C(_, _) => 1 
}
}