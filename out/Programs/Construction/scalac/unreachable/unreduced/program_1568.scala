package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: (T_B[Byte],(Boolean,Int))) extends T_A[((Boolean,Char),T_B[Char]), T_B[T_B[Boolean]]]
case class CC_B(a: (T_A[CC_A, Boolean],Int)) extends T_A[((Boolean,Char),T_B[Char]), T_B[T_B[Boolean]]]
case class CC_C(a: T_B[T_A[Byte, CC_B]], b: CC_A, c: T_A[T_B[Boolean], CC_B]) extends T_A[((Boolean,Char),T_B[Char]), T_B[T_B[Boolean]]]
case class CC_D[D](a: T_B[D], b: CC_B) extends T_B[D]
case class CC_E(a: CC_C, b: (CC_B,T_B[CC_A])) extends T_B[T_A[T_B[CC_B], T_B[(Char,Int)]]]

val v_a: T_A[((Boolean,Char),T_B[Char]), T_B[T_B[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B((_,_)) => 1 
  case CC_C(_, _, _) => 2 
}
}