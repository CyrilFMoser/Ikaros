package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: (T_A[Boolean, Boolean],T_A[Int, Int])) extends T_A[C, T_A[T_A[Char, Byte], Boolean]]
case class CC_B[D](a: D, b: D, c: D) extends T_A[D, T_A[T_A[Char, Byte], Boolean]]
case class CC_C(a: Boolean) extends T_A[T_A[((Byte,Char),Byte), CC_B[(Char,Boolean)]], T_A[T_A[Char, Byte], Boolean]]

val v_a: T_A[T_A[((Byte,Char),Byte), CC_B[(Char,Boolean)]], T_A[T_A[Char, Byte], Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_)) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_) => 2 
}
}