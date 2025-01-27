package Program_21 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[(Char,Int), (Int,Byte)], T_A[Char, (Boolean,Char)]], b: Int, c: (T_A[Byte, Char],T_A[(Byte,Boolean), Byte])) extends T_A[T_A[T_A[Char, Char], T_A[(Char,Int), Boolean]], T_A[T_A[Char, Boolean], T_A[Char, Char]]]
case class CC_B() extends T_A[T_A[T_A[Char, Char], T_A[(Char,Int), Boolean]], T_A[T_A[Char, Boolean], T_A[Char, Char]]]
case class CC_C() extends T_A[T_A[T_A[Char, Char], T_A[(Char,Int), Boolean]], T_A[T_A[Char, Boolean], T_A[Char, Char]]]

val v_a: T_A[T_A[T_A[Char, Char], T_A[(Char,Int), Boolean]], T_A[T_A[Char, Boolean], T_A[Char, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, (_,_)) => 0 
  case CC_B() => 1 
  case CC_C() => 2 
}
}