package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Int) extends T_A[T_A[Char, T_A[Byte, Int]], T_A[T_A[Int, Char], Byte]]
case class CC_B(a: T_A[T_A[Boolean, CC_A], T_A[CC_A, (Boolean,Char)]], b: T_A[CC_A, CC_A], c: Int) extends T_A[T_A[Char, T_A[Byte, Int]], T_A[T_A[Int, Char], Byte]]

val v_a: T_A[T_A[Char, T_A[Byte, Int]], T_A[T_A[Int, Char], Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
}
}