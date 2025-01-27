package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[T_A[Int, Int], Int], T_A[T_A[(Byte,Int), (Char,Boolean)], T_A[(Boolean,Char), Byte]]]
case class CC_B(a: CC_A, b: (T_A[(Int,Int), CC_A],CC_A), c: CC_A) extends T_A[T_A[T_A[Int, Int], Int], T_A[T_A[(Byte,Int), (Char,Boolean)], T_A[(Boolean,Char), Byte]]]
case class CC_C[C]() extends T_A[Boolean, CC_B]

val v_a: T_A[T_A[T_A[Int, Int], Int], T_A[T_A[(Byte,Int), (Char,Boolean)], T_A[(Boolean,Char), Byte]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), (_,CC_A()), CC_A()) => 1 
}
}