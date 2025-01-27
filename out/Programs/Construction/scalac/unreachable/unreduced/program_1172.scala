package Program_2 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: (CC_A,Byte), b: T_B[CC_A]) extends T_A
case class CC_C(a: T_A) extends T_B[T_B[CC_A]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((_,_), _) => 1 
}
}