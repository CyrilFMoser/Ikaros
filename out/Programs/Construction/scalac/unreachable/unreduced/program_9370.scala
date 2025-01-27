package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[Char, T_A[Boolean, Char]]]
case class CC_B(a: T_A[T_A[Boolean, Char], T_A[Boolean, (Char,Int)]], b: (T_A[Int, Char],T_A[Boolean, Char])) extends T_A[Char, T_A[Char, T_A[Boolean, Char]]]

val v_a: T_A[Char, T_A[Char, T_A[Boolean, Char]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, (_,_)) => 1 
}
}