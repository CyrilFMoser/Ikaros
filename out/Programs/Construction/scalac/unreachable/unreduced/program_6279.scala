package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Char, b: (T_B[Boolean, Int],T_A[Byte])) extends T_A[T_A[T_A[Boolean]]]
case class CC_B(a: T_A[Byte], b: CC_A) extends T_A[T_A[T_A[Boolean]]]
case class CC_C(a: (T_B[CC_B, CC_B],(CC_A,CC_A))) extends T_A[T_A[T_A[Boolean]]]

val v_a: T_A[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A('x', (_,_)) => 0 
  case CC_A(_, (_,_)) => 1 
  case CC_B(_, CC_A(_, _)) => 2 
  case CC_C((_,(_,_))) => 3 
}
}