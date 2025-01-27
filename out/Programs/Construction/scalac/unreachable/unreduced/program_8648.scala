package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Int, b: T_A[T_A[Char, Boolean], Byte], c: (T_A[(Byte,Byte), Byte],T_A[Boolean, Char])) extends T_A[T_A[T_A[Byte, Boolean], Char], Char]
case class CC_B(a: CC_A, b: Char) extends T_A[T_A[T_A[Byte, Boolean], Char], Char]
case class CC_C(a: T_A[CC_B, CC_A], b: Boolean, c: CC_B) extends T_A[T_A[T_A[Byte, Boolean], Char], Char]

val v_a: T_A[T_A[T_A[Byte, Boolean], Char], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, (_,_)) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, true, _) => 2 
  case CC_C(_, false, _) => 3 
}
}