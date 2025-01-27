package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Char, Boolean], T_A[Int, Int]], b: (T_A[(Char,Char), (Char,Int)],T_A[Byte, Char])) extends T_A[T_A[T_A[(Boolean,Boolean), Boolean], T_A[Boolean, Boolean]], T_A[Boolean, (Char,Boolean)]]
case class CC_B() extends T_A[T_A[T_A[(Boolean,Boolean), Boolean], T_A[Boolean, Boolean]], T_A[Boolean, (Char,Boolean)]]

val v_a: T_A[T_A[T_A[(Boolean,Boolean), Boolean], T_A[Boolean, Boolean]], T_A[Boolean, (Char,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_)) => 0 
  case CC_B() => 1 
}
}