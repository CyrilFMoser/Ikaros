package Program_11 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[T_A[Byte]]]
case class CC_B(a: T_A[CC_A], b: T_A[(CC_A,Char)], c: T_A[CC_A]) extends T_A[T_A[T_A[Byte]]]
case class CC_C(a: CC_A, b: (T_A[CC_A],Byte)) extends T_A[T_A[T_A[Byte]]]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, (_,0)) => 2 
  case CC_C(_, (_,_)) => 3 
}
}