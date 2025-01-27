package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Int, b: T_A, c: T_A) extends T_A
case class CC_B(a: Boolean, b: T_B[Char, T_B[T_A, T_A]], c: (Boolean,CC_A)) extends T_A
case class CC_C(a: (Int,(CC_A,T_A))) extends T_A
case class CC_D[C](a: T_B[C, C], b: T_B[CC_C, C]) extends T_B[CC_C, C]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_A(_, CC_B(_, _, _), _) => 1 
  case CC_A(_, CC_C((_,_)), _) => 2 
}
}