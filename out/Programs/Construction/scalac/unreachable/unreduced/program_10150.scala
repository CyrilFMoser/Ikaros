package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: (T_B[(Int,Int)],T_B[(Boolean,Char)])) extends T_A
case class CC_C(a: (CC_A,T_B[CC_A]), b: CC_A, c: T_B[T_B[T_A]]) extends T_A
case class CC_D(a: CC_A) extends T_B[(CC_B,T_B[T_A])]
case class CC_E(a: CC_C) extends T_B[(CC_B,T_B[T_A])]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((_,_)) => 1 
  case CC_C((CC_A(),_), CC_A(), _) => 2 
}
}