package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[Boolean], b: T_B, c: T_B) extends T_A[Boolean]
case class CC_B() extends T_B
case class CC_C(a: T_A[Boolean], b: (T_A[Byte],T_A[Boolean])) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_A(CC_A(_, _, _), CC_B(), _), (_,CC_A(_, _, _))) => 1 
  case CC_C(CC_A(CC_A(_, _, _), CC_C(_, _), _), (_,CC_A(_, _, _))) => 2 
}
}