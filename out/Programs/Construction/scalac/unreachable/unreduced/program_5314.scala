package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Char, Byte], T_A[Char, Byte]], b: T_A[T_A[Char, Boolean], T_A[Boolean, Boolean]], c: (Byte,T_A[Byte, Int])) extends T_A[T_A[T_A[Boolean, Char], T_A[(Boolean,Char), Byte]], T_A[T_A[Char, Char], T_A[Char, (Int,Char)]]]
case class CC_B(a: CC_A, b: CC_A, c: Byte) extends T_A[T_A[T_A[Boolean, Char], T_A[(Boolean,Char), Byte]], T_A[T_A[Char, Char], T_A[Char, (Int,Char)]]]

val v_a: T_A[T_A[T_A[Boolean, Char], T_A[(Boolean,Char), Byte]], T_A[T_A[Char, Char], T_A[Char, (Int,Char)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, (_,_)) => 0 
  case CC_B(_, _, _) => 1 
}
}