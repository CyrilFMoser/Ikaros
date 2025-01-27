package Program_17 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (Boolean,T_B[(Boolean,Boolean), Byte]), b: T_A, c: T_B[T_B[T_A, T_A], T_A]) extends T_A
case class CC_B(a: Char) extends T_A
case class CC_C(a: CC_A, b: CC_A, c: T_A) extends T_A
case class CC_D[C](a: T_B[CC_C, C], b: T_B[CC_C, C]) extends T_B[CC_C, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A((_,_), CC_A(_, _, _), _), _) => 0 
  case CC_A(_, CC_A((_,_), CC_B(_), _), _) => 1 
  case CC_A(_, CC_A((_,_), CC_C(_, _, _), _), _) => 2 
  case CC_A(_, CC_B(_), _) => 3 
  case CC_A(_, CC_C(_, _, _), _) => 4 
  case CC_B(_) => 5 
  case CC_C(_, _, _) => 6 
}
}