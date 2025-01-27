package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[T_A[Byte, Byte], ((Boolean,Int),Char)], T_A[T_A[Byte, Char], T_A[Int, Boolean]]]
case class CC_B(a: (T_A[Int, CC_A],Char), b: CC_A, c: Int) extends T_A[T_A[T_A[Byte, Byte], ((Boolean,Int),Char)], T_A[T_A[Byte, Char], T_A[Int, Boolean]]]
case class CC_C(a: CC_A, b: T_A[CC_B, Boolean], c: Byte) extends T_A[T_A[T_A[Byte, Byte], ((Boolean,Int),Char)], T_A[T_A[Byte, Char], T_A[Int, Boolean]]]

val v_a: T_A[T_A[T_A[Byte, Byte], ((Boolean,Int),Char)], T_A[T_A[Byte, Char], T_A[Int, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((_,_), CC_A(), _) => 1 
  case CC_C(_, _, _) => 2 
}
}