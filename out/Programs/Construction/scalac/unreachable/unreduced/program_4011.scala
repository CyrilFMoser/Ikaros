package Program_19 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_B[T_A]], b: T_A) extends T_A
case class CC_B() extends T_B[(T_B[CC_A],T_A)]
case class CC_C(a: (T_B[Int],CC_A), b: CC_B, c: CC_A) extends T_B[(T_B[CC_A],T_A)]
case class CC_D(a: (CC_B,Int), b: T_B[T_B[CC_C]]) extends T_B[(T_B[CC_A],T_A)]

val v_a: T_B[(T_B[CC_A],T_A)] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C((_,CC_A(_, _)), CC_B(), CC_A(_, _)) => 1 
  case CC_D((CC_B(),_), _) => 2 
}
}