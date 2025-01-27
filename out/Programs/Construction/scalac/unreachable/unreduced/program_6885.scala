package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: (T_B[T_A],T_B[T_A]), b: T_B[T_B[T_A]]) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C(a: Char) extends T_B[Boolean]
case class CC_D(a: CC_B, b: CC_A) extends T_B[Boolean]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A((_,_), _)) => 1 
  case CC_B(CC_B(CC_A(_, _))) => 2 
  case CC_B(CC_B(CC_B(_))) => 3 
}
}