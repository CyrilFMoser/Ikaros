package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[T_A[Byte, Byte], (Byte,Boolean)], T_A[(Boolean,Char), T_A[Byte, Int]]]
case class CC_B(a: T_A[Byte, Byte], b: CC_A, c: CC_A) extends T_A[T_A[T_A[Byte, Byte], (Byte,Boolean)], T_A[(Boolean,Char), T_A[Byte, Int]]]
case class CC_C(a: CC_B, b: CC_A, c: CC_B) extends T_A[T_A[T_A[Byte, Byte], (Byte,Boolean)], T_A[(Boolean,Char), T_A[Byte, Int]]]

val v_a: T_A[T_A[T_A[Byte, Byte], (Byte,Boolean)], T_A[(Boolean,Char), T_A[Byte, Int]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A(), _) => 1 
  case CC_C(CC_B(_, _, _), CC_A(), CC_B(_, _, _)) => 2 
}
}