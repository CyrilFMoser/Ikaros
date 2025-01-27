package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[Char], b: T_A[Char], c: (T_A[T_B],T_A[T_B])) extends T_A[Char]
case class CC_B(a: (CC_A,T_A[CC_A]), b: (CC_A,Byte)) extends T_A[Char]
case class CC_C() extends T_B

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(CC_A(_, _, _), CC_A(_, _, _), (_,_)), _) => 0 
  case CC_A(_, CC_A(CC_B(_, _), CC_A(_, _, _), (_,_)), _) => 1 
  case CC_A(_, CC_A(CC_A(_, _, _), CC_B(_, _), (_,_)), _) => 2 
  case CC_A(_, CC_A(CC_B(_, _), CC_B(_, _), (_,_)), _) => 3 
  case CC_A(_, CC_B((_,_), (_,_)), _) => 4 
  case CC_B(_, (CC_A(_, _, _),_)) => 5 
}
}