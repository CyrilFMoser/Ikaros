package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Char, Char], T_A[Char, (Int,Byte)]], b: T_A[T_A[Char, (Boolean,Char)], T_A[Char, Byte]]) extends T_A[T_A[T_A[Char, Byte], T_A[Boolean, Boolean]], T_A[T_A[Boolean, Boolean], T_A[Char, Int]]]
case class CC_B(a: CC_A) extends T_A[T_A[T_A[Char, Byte], T_A[Boolean, Boolean]], T_A[T_A[Boolean, Boolean], T_A[Char, Int]]]

val v_a: T_A[T_A[T_A[Char, Byte], T_A[Boolean, Boolean]], T_A[T_A[Boolean, Boolean], T_A[Char, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
}
}