package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[T_A[Boolean, Int], T_A[Boolean, (Boolean,Int)]]]
case class CC_B(a: T_A[T_A[Int, Char], CC_A[Char]], b: T_A[CC_A[Int], CC_A[Byte]], c: (T_A[Char, Boolean],CC_A[Char])) extends T_A[Boolean, T_A[T_A[Boolean, Int], T_A[Boolean, (Boolean,Int)]]]

val v_a: T_A[Boolean, T_A[T_A[Boolean, Int], T_A[Boolean, (Boolean,Int)]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, (_,_)) => 1 
}
}