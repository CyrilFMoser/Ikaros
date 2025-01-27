package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B) extends T_A[T_B]
case class CC_B() extends T_A[T_B]
case class CC_C(a: T_A[T_A[T_B]], b: (T_A[CC_A],T_B)) extends T_A[T_B]
case class CC_D(a: CC_A) extends T_B
case class CC_E(a: Char) extends T_B
case class CC_F(a: CC_C, b: CC_E, c: T_A[CC_C]) extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(CC_A(_))) => 0 
  case CC_A(CC_E(_)) => 1 
  case CC_A(CC_F(_, CC_E(_), _)) => 2 
  case CC_B() => 3 
  case CC_C(_, (_,CC_D(_))) => 4 
  case CC_C(_, (_,CC_E(_))) => 5 
  case CC_C(_, (_,CC_F(_, _, _))) => 6 
}
}