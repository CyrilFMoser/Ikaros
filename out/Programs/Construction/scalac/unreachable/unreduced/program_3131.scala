package Program_21 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (Int,T_B[T_A, (Boolean,Char)]), b: T_A) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C[C](a: T_B[C, C], b: CC_A, c: Char) extends T_B[CC_B, C]
case class CC_D[D](a: CC_C[D]) extends T_B[D, CC_C[D]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A((_,_), _) => 0 
  case CC_B(CC_A(_, CC_A(_, _))) => 1 
  case CC_B(CC_A(_, CC_B(_))) => 2 
  case CC_B(CC_B(CC_A(_, _))) => 3 
  case CC_B(CC_B(CC_B(_))) => 4 
}
}