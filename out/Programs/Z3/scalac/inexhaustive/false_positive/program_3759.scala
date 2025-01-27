package Program_14 

package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[(Char,Int), T_A]) extends T_A
case class CC_B[C, D](a: T_B[C, D]) extends T_B[C, D]
case class CC_C[E, F](a: CC_A, b: T_A, c: ((Byte,Boolean),Byte)) extends T_B[E, ((Byte,Int),CC_A)]
case class CC_D(a: CC_B[CC_A, T_A], b: T_B[CC_A, (Boolean,Char)], c: T_B[(Int,Byte), Char]) extends T_B[T_A, ((Byte,Int),CC_A)]

val v_a: T_B[Char, ((Byte,Int),CC_A)] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_), _, ((_,_),_)) => 0 
  case CC_C(CC_A(_), CC_A(_), ((_,_),0)) => 1 
  case CC_C(CC_A(_), CC_A(_), ((_,_),_)) => 2 
  case CC_C(CC_A(_), _, ((_,_),0)) => 3 
  case CC_C(CC_A(_), _, _) => 4 
  case CC_C(_, _, ((_,_),_)) => 5 
  case CC_B(_) => 6 
}
}
// This is not matched: (CC_C Char
//      T_A
//      Wildcard
//      Wildcard
//      (Tuple Wildcard Wildcard)
//      (T_B Char (Tuple (Tuple Byte Int) (CC_A T_A T_A))))
// This is not matched: Pattern match is empty without constants