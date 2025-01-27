package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[Byte]) extends T_A[T_A[(Char,Boolean)]]
case class CC_B[D](a: (T_A[(Char,Char)],T_B[CC_A, CC_A]), b: (T_B[CC_A, CC_A],CC_A), c: T_A[D]) extends T_B[Boolean, D]
case class CC_C() extends T_B[Boolean, Char]
case class CC_D(a: CC_B[Char], b: T_B[Boolean, Char], c: CC_A) extends T_B[Boolean, Char]

val v_a: T_B[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_B((_,_), (_,CC_A(_)), _) => 0 
  case CC_C() => 1 
  case CC_D(CC_B((_,_), (_,_), _), CC_B((_,_), _, _), CC_A(_)) => 2 
  case CC_D(CC_B((_,_), (_,_), _), CC_C(), CC_A(_)) => 3 
  case CC_D(CC_B((_,_), (_,_), _), CC_D(_, CC_B(_, _, _), _), CC_A(_)) => 4 
  case CC_D(CC_B((_,_), (_,_), _), CC_D(_, CC_C(), _), CC_A(_)) => 5 
}
}
// This is not matched: CC_D(CC_B((_,_), (_,_), _), CC_D(_, CC_D(_, _, _), _), CC_A(_))