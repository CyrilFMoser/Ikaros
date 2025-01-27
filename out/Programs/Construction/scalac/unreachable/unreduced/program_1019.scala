package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[Boolean, T_A[Char, (Char,Char)]], b: T_A[T_A[Boolean, Char], T_A[Byte, Boolean]]) extends T_A[T_A[T_A[Boolean, Boolean], T_A[Byte, Byte]], T_A[T_A[Char, Boolean], T_A[Boolean, Boolean]]]
case class CC_B(a: T_A[Int, (CC_A,(Char,Char))], b: Boolean, c: (T_A[CC_A, Byte],T_A[CC_A, CC_A])) extends T_A[T_A[T_A[Boolean, Boolean], T_A[Byte, Byte]], T_A[T_A[Char, Boolean], T_A[Boolean, Boolean]]]
case class CC_C[C](a: CC_A) extends T_A[T_A[T_A[Boolean, Boolean], T_A[Byte, Byte]], T_A[T_A[Char, Boolean], T_A[Boolean, Boolean]]]

val v_a: T_A[T_A[T_A[Boolean, Boolean], T_A[Byte, Byte]], T_A[T_A[Char, Boolean], T_A[Boolean, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_B(_, _, (_,_))