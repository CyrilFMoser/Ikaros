package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: (T_A[Byte, Byte],T_A[Int, Byte]), c: T_A[T_A[C, C], C]) extends T_A[T_A[T_A[Int, Char], (Byte,Char)], C]
case class CC_B() extends T_A[T_A[T_A[Int, Char], (Byte,Char)], (T_A[Int, Int],Char)]
case class CC_C() extends T_A[T_A[T_A[Int, Char], (Byte,Char)], CC_A[T_A[CC_B, CC_B]]]

val v_a: T_A[T_A[T_A[Int, Char], (Byte,Char)], CC_A[T_A[CC_B, CC_B]]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_), _) => 0 
  case CC_C() => 1 
}
}