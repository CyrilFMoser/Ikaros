package Program_24 

object Test {
sealed trait T_A[A]
case class CC_A(a: Boolean, b: ((Boolean,Byte),T_A[Boolean]), c: T_A[T_A[Boolean]]) extends T_A[Boolean]
case class CC_B(a: (T_A[CC_A],Byte), b: T_A[Boolean], c: (Boolean,Boolean)) extends T_A[Boolean]
case class CC_C[B](a: CC_A, b: CC_B) extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, ((_,_),CC_A(_, _, _)), _) => 0 
  case CC_A(_, ((_,_),CC_B(_, _, _)), _) => 1 
  case CC_A(_, ((_,_),CC_C(_, _)), _) => 2 
  case CC_B(_, _, _) => 3 
  case CC_C(CC_A(_, (_,_), _), _) => 4 
}
}