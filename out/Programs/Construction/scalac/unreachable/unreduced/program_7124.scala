package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Int) extends T_A[T_A[T_A[Boolean, Char], (Char,Int)], C]
case class CC_B[D](a: (T_A[Int, Boolean],Boolean)) extends T_A[T_A[T_A[Boolean, Char], (Char,Int)], D]
case class CC_C(a: T_A[Byte, CC_A[Boolean]], b: T_A[CC_B[Char], CC_A[Int]], c: CC_B[T_A[Boolean, (Boolean,Int)]]) extends T_A[T_A[T_A[Boolean, Char], (Char,Int)], T_A[CC_A[Byte], CC_A[Char]]]

val v_a: T_A[T_A[T_A[Boolean, Char], (Char,Int)], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B((_,_)) => 1 
}
}