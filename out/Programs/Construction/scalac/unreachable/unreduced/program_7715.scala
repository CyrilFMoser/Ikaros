package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[T_A[C, C], C]) extends T_A[T_A[C, C], C]
case class CC_B() extends T_A[T_A[(CC_A[Boolean],CC_A[Boolean]), (CC_A[Boolean],CC_A[Boolean])], (CC_A[Boolean],CC_A[Boolean])]
case class CC_C(a: CC_A[T_A[CC_B, CC_B]], b: Boolean, c: (T_A[CC_B, (Char,Char)],T_A[CC_B, CC_B])) extends T_A[T_A[((Boolean,Char),T_A[CC_B, CC_B]), ((Boolean,Char),T_A[CC_B, CC_B])], ((Boolean,Char),T_A[CC_B, CC_B])]

val v_a: T_A[T_A[((Boolean,Char),T_A[CC_B, CC_B]), ((Boolean,Char),T_A[CC_B, CC_B])], ((Boolean,Char),T_A[CC_B, CC_B])] = null
val v_b: Int = v_a match{
  case CC_A(((_,_),_), CC_A(_, _)) => 0 
  case CC_A(((_,_),_), CC_C(CC_A(_, _), _, (_,_))) => 1 
  case CC_C(_, _, _) => 2 
}
}