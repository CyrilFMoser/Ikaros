package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[C, T_A[T_A[Byte, Char], T_A[Int, Byte]]]
case class CC_B() extends T_A[T_A[T_A[(Boolean,Byte), Int], Byte], T_A[T_A[Byte, Char], T_A[Int, Byte]]]
case class CC_C(a: ((CC_B,CC_B),T_A[CC_B, CC_B]), b: T_A[CC_B, T_A[CC_B, CC_B]], c: Byte) extends T_A[T_A[T_A[(Boolean,Byte), Int], Byte], T_A[T_A[Byte, Char], T_A[Int, Byte]]]

val v_a: T_A[T_A[T_A[(Boolean,Byte), Int], Byte], T_A[T_A[Byte, Char], T_A[Int, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C((_,_), _, _) => 2 
}
}