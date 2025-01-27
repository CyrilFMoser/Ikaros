package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[T_A[(Boolean,Byte), (Int,Byte)], T_A[Byte, Int]], C]
case class CC_B(a: T_A[(Int,Byte), CC_A[Char]], b: T_A[CC_A[Char], CC_A[Boolean]]) extends T_A[T_A[T_A[(Boolean,Byte), (Int,Byte)], T_A[Byte, Int]], (CC_A[Char],Int)]
case class CC_C[D](a: CC_B, b: D) extends T_A[T_A[T_A[(Boolean,Byte), (Int,Byte)], T_A[Byte, Int]], D]

val v_a: T_A[T_A[T_A[(Boolean,Byte), (Int,Byte)], T_A[Byte, Int]], (CC_A[Char],Int)] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_C(CC_B(_, _), (CC_A(),_)) => 2 
}
}