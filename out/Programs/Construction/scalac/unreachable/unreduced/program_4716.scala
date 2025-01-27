package Program_21 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: ((T_A,T_A),T_B[T_A]), b: T_A) extends T_A
case class CC_B(a: CC_A, b: (T_B[(Boolean,Char)],Char), c: Char) extends T_A
case class CC_C(a: CC_A, b: Boolean, c: T_B[Boolean]) extends T_B[Boolean]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_A(_, CC_B(_, (_,_), _)) => 1 
  case CC_B(_, _, _) => 2 
}
}