package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: Byte, c: (T_A[Byte, Boolean],T_A[Boolean, Byte])) extends T_A[C, Char]
case class CC_B[D](a: CC_A[D], b: T_A[D, D], c: D) extends T_A[D, Char]
case class CC_C() extends T_A[T_A[(Boolean,Byte), Char], Char]

val v_a: T_A[Char, Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), _, _), _, (_,_)) => 0 
  case CC_A(CC_A(CC_B(_, _, _), _, _), _, (_,_)) => 1 
  case CC_A(CC_B(_, _, _), _, (_,_)) => 2 
  case CC_B(_, _, _) => 3 
}
}