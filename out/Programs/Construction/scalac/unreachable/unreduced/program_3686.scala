package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Boolean, Int],T_A[Int, (Byte,Char)]), b: (Char,Byte), c: T_A[C, C]) extends T_A[T_A[C, T_A[C, C]], C]
case class CC_B[D](a: T_A[D, CC_A[D]], b: CC_A[D]) extends T_A[D, CC_A[D]]
case class CC_C[E]() extends T_A[E, CC_A[E]]

val v_a: T_A[Byte, CC_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_B(_, _), CC_A(_, _, _)), CC_A((_,_), _, _)) => 0 
  case CC_B(CC_B(CC_C(), CC_A(_, _, _)), CC_A((_,_), _, _)) => 1 
  case CC_B(CC_C(), CC_A((_,_), _, _)) => 2 
  case CC_C() => 3 
}
}