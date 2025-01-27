package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A]) extends T_A
case class CC_B[B]() extends T_A
case class CC_C(a: (T_A,CC_A)) extends T_A
case class CC_D(a: T_B[CC_B[Char]], b: (T_B[Byte],Byte)) extends T_B[CC_B[Char]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C((_,_)) => 2 
}
}